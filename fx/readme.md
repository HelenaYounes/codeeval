How to run Snake
===

Initialize Directories
---
```bash
# (mkdir = make directory)
mkdir classes dist
```

Compile
---
```bash
javac -d classes src/application/Main.java
```

Package
---
```bash
/Library/Java/JavaVirtualMachines/jdk1.8.0_72.jdk/Contents/Home/bin/javapackager -createjar -appclass application.Main -srcdir classes -outdir dist -outfile snake.jar -v
```

Run
---
```bash
java -jar dist/snake.jar
```
