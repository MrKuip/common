package org.kku.common.util;

public class StringUtils
{
  static public boolean isNotBlank(String text)
  {
    return text != null && !text.isBlank();
  }

  public static boolean isAllLetters(String type)
  {
    int length = type.length();

    for (int i = 0; i < length; i++)
    {
      if (!(Character.isLetter(type.charAt(i))))
      {
        return false;
      }
    }

    return true;
  }

  public static boolean isEmpty(String string)
  {
    return string == null || string.isEmpty();
  }
}
