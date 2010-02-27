set JAVA_HOME=C:\Program Files\Java\jdk1.5.0_12
ant -Dbuckminster_release=3.6 -Dtarget=promote.sites -Dloglevel=INFO -Dorg.eclipse.update.jarprocessor.pack200="C:/Program Files/Java/jdk1.6.0_17/bin" -Dsite.suffix=3.5 -Declipse.release=3.5 -Dbuild.type=R -Dbuckminster.loglevel=INFO promote.sites
