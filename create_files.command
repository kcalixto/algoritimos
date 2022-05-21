#!/bin/bash
amount=42
folder=lista04
for ((i=1; i<=$amount; i++)); do
    cp src/com/kaua/$folder/ex1.java src/com/kaua/$folder/ex$i.java 
    sed -i.bak -e"s/ex1/ex$i/" src/com/kaua/$folder/ex$i.java
    rm -rf src/com/kaua/$folder/ex$i.java.bak
    echo "created file: " + src/com/kaua/$folder/ex$i.java
done