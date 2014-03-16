//scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.6-M2"
  Seq(
    "net.liftweb"             %% "lift-common"      % liftVersion % "compile",
    "net.liftweb"             %% "lift-util"        % liftVersion % "compile",
    "net.liftweb"             %% "lift-json"        % liftVersion % "compile",
    "org.scalaj"              %% "scalaj-collection"  % "1.5",
    "org.scalaj"              %% "scalaj-http"        % "0.3.14" % "compile",
    "junit"                   % "junit"               % "4.8.2"  % "test",
    "org.scala-tools.testing" %% "specs"              % "1.6.9"  % "test",
    "com.novocode"            % "junit-interface"     % "0.10"   % "test"
  )
}
