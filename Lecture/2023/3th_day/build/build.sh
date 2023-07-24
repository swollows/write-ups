#!/bin/bash

# Find all subdirectories recursively
find . -type d | while read -r dir; do
    # Move to the subdirectory
    cd "$dir" || continue

    # Compile *.c files into *
    for file in *.c; do
        # Exclude directories and symbolic links
        if [ -f "$file" ]; then
            # Compile the *.c file into *
            gcc "$file" -o "${file%.c}"
        fi
    done

    # Move back to the original directory
    cd - > /dev/null
done
