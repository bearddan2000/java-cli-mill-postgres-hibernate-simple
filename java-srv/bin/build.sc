import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
    ivy"org.postgresql:postgresql:42.2.18.jre7",
    ivy"log4j:log4j:1.2.17",
    ivy"org.slf4j:slf4j-api:1.7.5",
    ivy"org.slf4j:slf4j-log4j12:1.7.5",
    ivy"org.hibernate:hibernate-core:5.3.7.Final",
    ivy"jakarta.xml.bind:jakarta.xml.bind-api:2.3.3",
  	ivy"org.glassfish.jaxb:jaxb-runtime:2.3.3"
   )
}
