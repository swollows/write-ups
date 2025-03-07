from setuptools import setup

APP = ['flask_app.py']
DATA_FILES = [
    ('flags', ['flag01', 'flag02']),
]

OPTIONS = {
    'argv_emulation': True,
    'packages': ['flask', 'hashlib', 'os', 'sys', 'time', 'string', 'random']
}

setup(
    app=APP,
    data_files=DATA_FILES,
    options={'py2app': OPTIONS},
    setup_requires=['py2app'],
)