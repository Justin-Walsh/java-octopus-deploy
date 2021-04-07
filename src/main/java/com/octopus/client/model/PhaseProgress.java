// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * Gets or Sets PhaseProgress
 */
@JsonAdapter(PhaseProgress.Adapter.class)
public enum PhaseProgress {

  PENDING("Pending"),

  CURRENT("Current"),

  COMPLETE("Complete");

  private String value;

  PhaseProgress(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PhaseProgress fromValue(String value) {
    for (PhaseProgress b : PhaseProgress.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PhaseProgress> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final PhaseProgress enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PhaseProgress read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PhaseProgress.fromValue(value);
    }
  }
}
