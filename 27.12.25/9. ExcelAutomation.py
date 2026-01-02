import openpyxl

wb = openpyxl.Workbook()
sheet = wb.active
sheet["A1"] = "Name"
sheet["B1"] = "Age"
sheet.append(["Revanth", 20])
wb.save("sample.xlsx")
