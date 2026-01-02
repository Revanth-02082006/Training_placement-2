with open("log.txt") as f:
    errors = sum(1 for line in f if "ERROR" in line)
    warnings = sum(1 for line in f if "WARNING" in line)
print("Errors:", errors, "Warnings:", warnings)
