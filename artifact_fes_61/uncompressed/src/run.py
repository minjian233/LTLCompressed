import os
import sys
for i in range(1,11):
    index=str(i)
    file_name="zzz"+index+".pbs"
    with open(file_name,"a") as myfile:
        myfile.write("#!/bin/bash\n#\n#PBS -l walltime=8:00:00\n#PBS -l nodes=2:ppn=4\n#PBS -N myjob\n#PBS -q cs\n#\n#\n#\n")
        myfile.write("module use /projects/eng/modulefiles\n")
        myfile.write("module load maven/3.6.3\n")
        myfile.write("module load git/2.19.0\n")
        myfile.write("module load python/3\n")
        command = 'python3 c1.py '+index
        myfile.write(command)
    os.system("sbatch "+file_name)
