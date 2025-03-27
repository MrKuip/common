package org.kku.common.conf.dao;

import java.util.List;

import org.kku.common.conf.Language;
import org.kku.common.conf.LanguageConfiguration;

public class LanguageDAO
  extends AbstractDAO<LanguageConfiguration, Language>
{
  public LanguageDAO()
  {
    super(LanguageConfiguration.class);
  }

  @Override
  public Language create()
  {
    Language language;

    language = new Language();

    return language;
  }

  @Override
  public void insert(Language language)
  {
    getConfiguration().add(language);
  }

  @Override
  public void remove(Language language)
  {
    getConfiguration().remove(language);
  }

  @Override
  public List<Language> selectAll()
  {
    return getConfiguration().getList();
  }
}