echo "Cloning repo"
git clone https://github.com/JesterOrNot/pycalc.git
cd pycalc
echo "Installing pycalc"
python3 setup.py install
echo "removing unnecessary folder"
cd ..
rm -rf pycalc
echo "Done"