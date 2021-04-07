// Octopus REST API v2021.2.1387

package com.octopus.client.auth;

import com.octopus.client.Pair;
import java.util.List;
import java.util.Map;

@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class HttpBearerAuth implements Authentication {
  private final String scheme;
  private String bearerToken;

  public HttpBearerAuth(String scheme) { this.scheme = scheme; }

  /**
   * Gets the token, which together with the scheme, will be sent as the value
   * of the Authorization header.
   *
   * @return The bearer token
   */
  public String getBearerToken() { return bearerToken; }

  /**
   * Sets the token, which together with the scheme, will be sent as the value
   * of the Authorization header.
   *
   * @param bearerToken The bearer token to send in the Authorization header
   */
  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams,
                            Map<String, String> headerParams,
                            Map<String, String> cookieParams) {
    if (bearerToken == null) {
      return;
    }

    headerParams.put("Authorization",
                     (scheme != null ? upperCaseBearer(scheme) + " " : "") +
                         bearerToken);
  }

  private static String upperCaseBearer(String scheme) {
    return ("bearer".equalsIgnoreCase(scheme)) ? "Bearer" : scheme;
  }
}
