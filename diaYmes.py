def main():
    fechaValida = False

    while not fechaValida:
        print("\n------------------------------------------------Ingresa el mes------------------------------------------------ ")
        print("|1-Enero|2-Febrero|3-Marzo|4-Abril|5-Mayo|6-Junio|7-Julio|8-Agosto|9-Septiembre|10-Octubre|11-Noviembre|12-Diciembre|")

        mes_input = input("Mes: ")
        if not mes_input.isdigit():
            print("ERROR: el mes debe ser un número entero")
            continue
        mes = int(mes_input)

            # Switch equivalente en Python 3.10+
        if 1 <= mes and mes <= 12:
            match mes:
                case 1 | 3 | 5 | 7 | 8 | 10 | 12:
                    diaMax = 31
                case 4 | 6 | 9 | 11:
                    diaMax = 30
                case 2:
                    diaMax = 29

            dia_input = input("------------------------------------------------Ingresa el dia------------------------------------------------ \nDía: ")
            if not dia_input.isdigit():
                print("ERROR: el día debe ser un número entero")
                continue
            dia = int(dia_input)

            if dia < 1 or dia > diaMax:
                print("Dia introducido no valido")
                print("Este mes solo contiene", diaMax, "días")
            else:
                print("La fecha introducida es:", f"{dia}/{mes}")
                fechaValida = True
        else:
            print("Mes introducido no valido") 
        

if __name__ == "__main__":
    main()