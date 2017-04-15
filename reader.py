import pandas as pd

file1 = pd.read_csv("finaltest.csv")
file2 = pd.read_csv("stores.csv")

result = pd.merge(file1, file2, on = ['Store'])
result.to_csv('ftest.csv', index=False)