awk 'NR==10' file.txt

# print tenth line of the file.txt
# awk is the text processing language used for the pattern scanning on file and streams
# awk 'pattern { action }' filename where pattern is the regular expression pattern and action is the condition and filename where we have to extract the data from the file
# awk 'NR==10' file.txt here NR (Number of Records) built-in variable
