package chrome.xmdl.core.templates.build.impl;

import chrome.xmdl.*;

public class POMImpl
{
  protected static String nl;
  public static synchronized POMImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    POMImpl result = new POMImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    " + NL + "     ";
  protected final String TEXT_2 = NL + "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">" + NL + "    <modelVersion>4.0.0</modelVersion>" + NL + "    <groupId>";
  protected final String TEXT_3 = "</groupId>" + NL + "    <artifactId>Reservation</artifactId>" + NL + "    <packaging>war</packaging>" + NL + "    <version>1.0</version>" + NL + "    <name>Reservation</name>" + NL + "    <inceptionYear>2006</inceptionYear>" + NL + "    <developers>" + NL + "        <developer>" + NL + "            <id>xmcakkan</id>" + NL + "            <name>Mert Can Akkan</name>" + NL + "            <email>mcakkan@gmail.com</email>" + NL + "        </developer>" + NL + "    </developers>" + NL + "    <url>http://maven.apache.org</url>" + NL + "    <scm>" + NL + "        <connection>scm:cvs:pserver:anonymous@192.168.1.165:/opt/repository</connection>" + NL + "    </scm>" + NL + "    <dependencies>" + NL + "        <dependency>" + NL + "            <groupId>tr.com.siemens.ik.web.chrome</groupId>" + NL + "            <artifactId>corelib</artifactId>" + NL + "            <version>1.0</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>javax.servlet</groupId>" + NL + "            <artifactId>servlet-api</artifactId>" + NL + "            <scope>provided</scope>" + NL + "            <version>2.4</version>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>javax.servlet</groupId>" + NL + "            <artifactId>jsp-api</artifactId>" + NL + "            <scope>provided</scope>" + NL + "            <version>2.0</version>" + NL + "        </dependency>" + NL + "\t\t<dependency>" + NL + "            <groupId>strutstestcase</groupId>" + NL + "            <artifactId>strutstestcase</artifactId>" + NL + "            <version>2.1.2-1.1-2.3</version>" + NL + "\t\t\t<scope>test</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>junit</groupId>" + NL + "            <artifactId>junit</artifactId>" + NL + "            <version>3.8.1</version>" + NL + "\t\t\t<scope>test</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>org.springframework</groupId>" + NL + "            <artifactId>spring-mock</artifactId>" + NL + "            <version>1.2.6</version>" + NL + "            <scope>test</scope>" + NL + "        </dependency>" + NL + "\t\t<!--" + NL + "        <dependency>" + NL + "            <groupId>log4j</groupId>" + NL + "            <artifactId>log4j</artifactId>" + NL + "            <version>1.2.12</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>dom4j</groupId>" + NL + "            <artifactId>dom4j</artifactId>" + NL + "            <version>1.6</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "" + NL + "        <dependency>" + NL + "            <groupId>commons-beanutils</groupId>" + NL + "            <artifactId>commons-beanutils</artifactId>" + NL + "            <version>1.7.0</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>commons-collections</groupId>" + NL + "            <artifactId>commons-collections</artifactId>" + NL + "            <version>3.1</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>commons-digester</groupId>" + NL + "            <artifactId>commons-digester</artifactId>" + NL + "            <version>1.6</version>" + NL + "            <scope>runtime</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>commons-fileupload</groupId>" + NL + "            <artifactId>commons-fileupload</artifactId>" + NL + "            <version>1.0</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>commons-lang</groupId>" + NL + "            <artifactId>commons-lang</artifactId>" + NL + "            <version>2.1</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "" + NL + "" + NL + "        <dependency>" + NL + "            <groupId>xml-apis</groupId>" + NL + "            <artifactId>xml-apis</artifactId>" + NL + "            <version>1.0.b2</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "" + NL + "        <dependency>" + NL + "            <groupId>org.springframework</groupId>" + NL + "            <artifactId>spring-hibernate</artifactId>" + NL + "            <version>1.2.6</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>org.springframework</groupId>" + NL + "            <artifactId>spring-dao</artifactId>" + NL + "            <version>1.2.6</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>org.springframework</groupId>" + NL + "            <artifactId>spring-jdbc</artifactId>" + NL + "            <version>1.2.6</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "" + NL + "        <dependency>" + NL + "            <groupId>org.springframework</groupId>" + NL + "            <artifactId>spring-mock</artifactId>" + NL + "            <version>1.2.6</version>" + NL + "            <scope>test</scope>" + NL + "        </dependency>" + NL + "" + NL + "        <dependency>" + NL + "            <groupId>castor</groupId>" + NL + "            <artifactId>castor</artifactId>" + NL + "            <version>1.0</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "" + NL + "" + NL + "       " + NL + "" + NL + "        <dependency>" + NL + "            <groupId>struts</groupId>" + NL + "            <artifactId>struts-el</artifactId>" + NL + "            <version>1.2.8</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>struts</groupId>" + NL + "            <artifactId>struts</artifactId>" + NL + "            <version>1.2.8</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>taglibs</groupId>" + NL + "            <artifactId>standard</artifactId>" + NL + "            <scope>compile</scope>" + NL + "            <version>1.1.2</version>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>displaytag</groupId>" + NL + "            <artifactId>displaytag</artifactId>" + NL + "            <scope>compile</scope>" + NL + "            <version>1.1</version>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>displaytag</groupId>" + NL + "            <artifactId>displaytag-export-poi</artifactId>" + NL + "            <scope>compile</scope>" + NL + "            <version>1.1</version>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>tr.com.oasis</groupId>" + NL + "            <artifactId>babylon</artifactId>" + NL + "            <scope>compile</scope>" + NL + "            <version>2.1</version>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>net.htmlparser</groupId>" + NL + "            <artifactId>jericho-html</artifactId>" + NL + "            <scope>compile</scope>" + NL + "            <version>1.5-dev1</version>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>org.ajaxtags</groupId>" + NL + "            <artifactId>ajaxtags</artifactId>" + NL + "            <scope>compile</scope>" + NL + "            <version>1.1.5</version>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>org.springframework</groupId>" + NL + "            <artifactId>spring-web</artifactId>" + NL + "            <version>1.2.6</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "        <dependency>" + NL + "            <groupId>org.acegisecurity</groupId>" + NL + "            <artifactId>acegi-security</artifactId>" + NL + "            <version>1.0.0-RC1</version>" + NL + "            <scope>compile</scope>" + NL + "        </dependency>" + NL + "-->" + NL + "        <!--" + NL + "        mvn install:install-file -Dfile=c:\\root\\maven\\repository\\jericho-html\\jars\\jericho-html-1.5-dev1.jar -DgroupId=net.sourceforge.jericho-html  -DartifactId=jericho-html -Dversion=1.5-dev1 -Dpackaging=jar" + NL + "        -->" + NL + "" + NL + "        <!--mvn install:install-file -Dfile=c:\\root\\maven\\repository\\ajaxtags\\jars\\ajaxtags-1.1.5.jar -DgroupId=net.sourceforge.ajaxtags  -DartifactId=ajaxtags -Dversion=1.1.5 -Dpackaging=jar-->" + NL + "" + NL + "" + NL + "    </dependencies>" + NL + "    <build>" + NL + "        <plugins>" + NL + "            <plugin>" + NL + "                <groupId>org.apache.maven.plugins</groupId>" + NL + "                <artifactId>maven-compiler-plugin</artifactId>" + NL + "                <configuration>" + NL + "                    <source>1.5</source>" + NL + "                    <target>1.5</target>" + NL + "                </configuration>" + NL + "            </plugin>" + NL + "            <plugin>" + NL + "                <groupId>org.apache.maven.plugins</groupId>" + NL + "                <artifactId>maven-surefire-plugin</artifactId>" + NL + "                <configuration>" + NL + "                    <includes>" + NL + "                        <include implementation=\"java.lang.String\">**/*TestDAO.java</include>" + NL + "                    </includes>" + NL + "                </configuration>" + NL + "            </plugin>" + NL + "            <plugin>" + NL + "                <artifactId>maven-checkstyle-plugin</artifactId>" + NL + "                <dependencies>" + NL + "                    <dependency>" + NL + "                        <groupId>log4j</groupId>" + NL + "                        <artifactId>log4j</artifactId>" + NL + "                        <version>1.2.12</version>" + NL + "                    </dependency>" + NL + "                </dependencies>" + NL + "            </plugin>" + NL + "            <plugin>" + NL + "                <groupId>org.apache.maven.plugins</groupId>" + NL + "                <artifactId>maven-antrun-plugin</artifactId>" + NL + "                <executions>" + NL + "                    <execution>" + NL + "                        <id>process-resources</id>" + NL + "                        <phase>process-resources</phase>" + NL + "                        <configuration>" + NL + "                            <tasks>" + NL + "                                <taskdef name=\"native2ascii\"" + NL + "                                         classname=\"org.apache.tools.ant.taskdefs.optional.Native2Ascii\"" + NL + "                                         classpathref=\"maven.dependency.classpath\">" + NL + "                                    <classpath>" + NL + "                                        <pathelement path=\"maven.dependency.classpath\"/>" + NL + "                                    </classpath>" + NL + "                                </taskdef>" + NL + "                                <delete dir=\"${basedir}/target/classes\" includes=\"**/*.properties\"/>" + NL + "                                <native2ascii src=\"${basedir}/rsc/\"" + NL + "                                              dest=\"${basedir}/target/classes\"" + NL + "                                              includes=\"**/*.properties\" encoding=\"ISO-8859-9\"/>" + NL + "                            </tasks>" + NL + "" + NL + "                        </configuration>" + NL + "                        <goals>" + NL + "                            <goal>run</goal>" + NL + "                        </goals>" + NL + "                    </execution>" + NL + "                </executions>" + NL + "                <dependencies>" + NL + "                    <dependency>" + NL + "                        <groupId>ant</groupId>" + NL + "                        <artifactId>ant-antlr</artifactId>" + NL + "                        <version>1.6.5</version>" + NL + "                        <scope>compile</scope>" + NL + "                    </dependency>" + NL + "                    <dependency>" + NL + "                        <groupId>antlr</groupId>" + NL + "                        <artifactId>antlrall</artifactId>" + NL + "                        <scope>compile</scope>" + NL + "                        <version>2.7.4</version>" + NL + "                    </dependency>" + NL + "                    <dependency>" + NL + "                        <groupId>ant</groupId>" + NL + "                        <artifactId>ant-nodeps</artifactId>" + NL + "                        <version>1.6.5</version>" + NL + "                        <scope>compile</scope>" + NL + "                    </dependency>" + NL + "" + NL + "                    <dependency>" + NL + "                        <groupId>java.sun.com</groupId>" + NL + "                        <artifactId>tools</artifactId>" + NL + "                        <version>1.5.0</version>" + NL + "                        <scope>system</scope>" + NL + "                        <systemPath>${java.home}/../lib/tools.jar</systemPath>" + NL + "                    </dependency>" + NL + "                </dependencies>" + NL + "            </plugin>" + NL + "" + NL + "            <!--<plugin>-->" + NL + "            <!--<groupId>maven</groupId>-->" + NL + "            <!--<artifactId>maven-jdepend-plugin</artifactId>-->" + NL + "            <!--<version>1.0</version>-->" + NL + "            <!--</plugin>-->" + NL + "            <!--<plugin>-->" + NL + "            <!--<groupId>maven</groupId>-->" + NL + "            <!--<artifactId>maven-jalopy-plugin</artifactId>-->" + NL + "            <!--<version>1.3.1</version>-->" + NL + "            <!--</plugin>-->" + NL + "        </plugins>" + NL + "" + NL + "    </build>" + NL + "    <reporting>" + NL + "        <plugins>" + NL + "            <plugin>" + NL + "                <groupId>org.apache.maven.plugins</groupId>" + NL + "                <artifactId>maven-project-info-reports-plugin</artifactId>" + NL + "            </plugin>" + NL + "            <plugin>" + NL + "                <groupId>org.codehaus.mojo</groupId>" + NL + "                <artifactId>jxr-maven-plugin</artifactId>" + NL + "            </plugin>" + NL + "            <plugin>" + NL + "                <groupId>org.codehaus.mojo</groupId>" + NL + "                <artifactId>changes-maven-plugin</artifactId>" + NL + "            </plugin>" + NL + "            <plugin>" + NL + "                <groupId>org.codehaus.mojo</groupId>" + NL + "                <artifactId>surefire-report-maven-plugin</artifactId>" + NL + "            </plugin>" + NL + "            <plugin>" + NL + "                <groupId>org.apache.maven.plugins</groupId>" + NL + "                <artifactId>maven-checkstyle-plugin</artifactId>" + NL + "" + NL + "            </plugin>" + NL + "            <!--<plugin>-->" + NL + "            <!--<groupId>net.sourceforge.maven-taglib</groupId>-->" + NL + "            <!--<artifactId>maven-taglib-plugin</artifactId>-->" + NL + "            <!--<version>2.0</version>-->" + NL + "            <!--</plugin>-->" + NL + "        </plugins>" + NL + "    </reporting>" + NL + "</project>";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
    XProject xProject = (XProject) argument;

    stringBuffer.append(TEXT_2);
    stringBuffer.append(xProject.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}