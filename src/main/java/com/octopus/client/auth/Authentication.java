// Octopus REST API v2021.2.1387

package com.octopus.client.auth;

import com.octopus.client.Pair;
import java.util.List;
import java.util.Map;

public interface Authentication {
  /**
   * Apply authentication settings to header and query params.
   *
   * @param queryParams List of query parameters
   * @param headerParams Map of header parameters
   * @param cookieParams Map of cookie parameters
   */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams,
                     Map<String, String> cookieParams);
}
