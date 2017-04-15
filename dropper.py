import pandas as pd

file1 = pd.read_csv("test.csv")
result = file1.drop("SalesForecast", axis = 1)
result.to_csv('test1.csv', index=False)