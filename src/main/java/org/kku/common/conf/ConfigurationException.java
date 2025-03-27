package org.kku.common.conf;

import org.kku.common.util.Log;

public class ConfigurationException
  extends RuntimeException
{
  public ConfigurationException(String format, Object... args)
  {
    super(String.format(format, args));
    Log.log.error(this, format, args);
  }

  public ConfigurationException(Throwable throwable, String format, Object... args)
  {
    super(String.format(format, args), throwable);
    Log.log.error(this, format, args);
  }
}
