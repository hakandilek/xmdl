package org.xmdl.core.templates.context.impl;

public class EhCacheImpl
{
  protected static String nl;
  public static synchronized EhCacheImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EhCacheImpl result = new EhCacheImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<ehcache>" + NL + "" + NL + "    <!-- Sets the path to the directory where cache .data files are created." + NL + "" + NL + "         If the path is a Java System Property it is replaced by" + NL + "         its value in the running VM." + NL + "" + NL + "         The following properties are translated:" + NL + "         user.home - User's home directory" + NL + "         user.dir - User's current working directory" + NL + "         java.io.tmpdir - Default temp file path -->" + NL + "    <diskStore path=\"java.io.tmpdir\"/>" + NL + "" + NL + "" + NL + "    <!--Default Cache configuration. These will applied to caches programmatically created through" + NL + "        the CacheManager." + NL + "" + NL + "        The following attributes are required:" + NL + "" + NL + "        maxElementsInMemory            - Sets the maximum number of objects that will be created in memory" + NL + "        eternal                        - Sets whether elements are eternal. If eternal,  timeouts are ignored and the" + NL + "                                         element is never expired." + NL + "        overflowToDisk                 - Sets whether elements can overflow to disk when the in-memory cache" + NL + "                                         has reached the maxInMemory limit." + NL + "" + NL + "        The following attributes are optional:" + NL + "        timeToIdleSeconds              - Sets the time to idle for an element before it expires." + NL + "                                         i.e. The maximum amount of time between accesses before an element expires" + NL + "                                         Is only used if the element is not eternal." + NL + "                                         Optional attribute. A value of 0 means that an Element can idle for infinity." + NL + "                                         The default value is 0." + NL + "        timeToLiveSeconds              - Sets the time to live for an element before it expires." + NL + "                                         i.e. The maximum time between creation time and when an element expires." + NL + "                                         Is only used if the element is not eternal." + NL + "                                         Optional attribute. A value of 0 means that and Element can live for infinity." + NL + "                                         The default value is 0." + NL + "        diskPersistent                 - Whether the disk store persists between restarts of the Virtual Machine." + NL + "                                         The default value is false." + NL + "        diskExpiryThreadIntervalSeconds- The number of seconds between runs of the disk expiry thread. The default value" + NL + "                                         is 120 seconds." + NL + "        -->" + NL + "" + NL + "    <defaultCache" + NL + "        maxElementsInMemory=\"10000\"" + NL + "        eternal=\"false\"" + NL + "        overflowToDisk=\"true\"" + NL + "        timeToIdleSeconds=\"120\"" + NL + "        timeToLiveSeconds=\"120\"" + NL + "        diskPersistent=\"false\"" + NL + "        diskExpiryThreadIntervalSeconds=\"120\"/>" + NL + "        " + NL + "    <!-- See http://ehcache.sourceforge.net/documentation/#mozTocId258426 for how to configure caching for your objects -->" + NL + "</ehcache>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
