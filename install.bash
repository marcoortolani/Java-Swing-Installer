echo "Cloning repo"
git clone https://github.com/JesterOrNot/pymath.git
cd pymath
echo "Installing pycalc"
python3 setup.py install
echo "removing unnecessary folder"
cd ..
rm -rf pymath
echo "Done"