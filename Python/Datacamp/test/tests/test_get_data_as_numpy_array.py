# -*- coding: utf-8 -*-
"""
Created on Fri Jun 26 09:53:06 2020

@author: Utilisateur
"""

import numpy as np
import pytest
import sys
sys.path.append("..")
from functions import get_data_as_numpy_array


def test_on_clean_file():
  expected = np.array([[2081.0, 314942.0],
                       [1059.0, 186606.0],
  					   [1148.0, 206186.0]
                       ]
                      )
  actual = get_data_as_numpy_array("../../Datasets/clean_data.txt", num_columns=2)
  message = "Expected return value: {0}, Actual return value: {1}".format(expected, actual)
  # Complete the assert statement
  assert actual == pytest.approx(expected), message
