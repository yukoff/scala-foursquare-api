import sbt._

class ScalaFoursquareProject(info: ProjectInfo) extends DefaultProject(info) {
  override def managedStyle = ManagedStyle.Maven
  override def packageSrcJar= defaultJarPath("-sources.jar")
  
  val liftVersion = "2.6-M2"
  val liftCommon =        "net.liftweb"             %% "lift-common"        % liftVersion % "compile" withSources()
  val liftUtil =          "net.liftweb"             %% "lift-util"          % liftVersion % "compile" withSources()
  val liftJson =          "net.liftweb"             %% "lift-json"          % liftVersion % "compile" withSources()
  val scalajCollection  = "org.scalaj"              %% "scalaj-collection"  % "1.5"
  val scalajHttp =        "org.scalaj"              %% "scalaj-http"        % "0.3.14" % "compile" withSources()
  val junit =             "junit"                   % "junit"               % "4.8.2"  % "test" withSources()
  val specs =             "org.scala-tools.testing" %% "specs"              % "1.6.9"  % "test" withSources()
  val junitInterface =    "com.novocode"            % "junit-interface"     % "0.10"   % "test"

  val bryanjswift = "Bryan J Swift Repository" at "http://repos.bryanjswift.com/maven2/"
  override def testFrameworks = super.testFrameworks ++ List(new TestFramework("com.novocode.junit.JUnitFrameworkNoMarker"))
}
