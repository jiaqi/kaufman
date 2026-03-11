package org.cyclopsgroup.kaufman.interfaces;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A class where {@link #hashCode()}, {@link #equals(Object)} and {@link #toString()} are
 * implemented with builders in commons-lang, which makes derived classes easy to compare in unit
 * tests
 */
public abstract class BaseComparableBean {
  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
