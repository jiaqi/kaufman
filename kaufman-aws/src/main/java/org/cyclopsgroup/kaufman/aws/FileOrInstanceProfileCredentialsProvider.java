package org.cyclopsgroup.kaufman.aws;

import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileOrInstanceProfileCredentialsProvider extends ChainedCredentialsProvider {
  public FileOrInstanceProfileCredentialsProvider(File file) throws IOException {
    super(Arrays.asList(file, new InstanceProfileCredentialsProvider()));
  }

  public FileOrInstanceProfileCredentialsProvider(String file) throws IOException {
    super(Arrays.asList(file, new InstanceProfileCredentialsProvider()));
  }
}
