package com.softserve.edu.practical.Practical_tasks_04_condition_statements.task_3;

import java.util.Scanner;

public class Appl {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter country : ");
        String country = input.nextLine();
        switch (country){
            case "Ukraine" :
            case "Austria":
            case "Belgium":
            case "Liechtenstein":
            case "Luxembourg":
            case "Monaco":
            case "Netherlands":
            case "Germany":
            case "France":
            case "Switzerland":
            case "Albania":
            case "Andorra":
            case "Bosnia and Herzegovina":
            case "Vatican":
            case "Greece":
            case "Spain":
            case "Italy":
            case "North Macedonia":
            case "Malta":
            case "Portugal":
            case "San Marino":
            case "Serbia":
            case "Slovenia":
            case "Croatia":
            case "Montenegro":
            case "United Kingdom":
            case "Denmark":
            case "Estonia":
            case "Ireland":
            case "Iceland":
            case "Latvia":
            case "Lithuania":
            case "Norway":
            case "Finland":
            case "Sweden":
            case "Bulgaria":
            case "Moldova":
            case "Poland":
            case "Romania":
            case "Slovakia":
            case "Hungary":
            case "Czech":
            case "Azerbaijan":
            case "Georgia":
            case "Kazakhstan":
            case "Turkey":
            case "Armenia":
            case "Cyprus":
            case "Bahrain":
            case "Yemen":
            case "Jordan":
            case "Israel":
            case "Iraq":
            case "Iran":
            case "Qatar":
            case "Kuwait":
            case "Lebanon":
            case "United Arab Emirates":
            case "Oman":
            case "Saudi Arabia":
            case "Syria":
            case "Afghanistan":
            case "Bangladesh":
            case "Butane":
            case "India":
            case "Maldives":
            case "Nepal":
            case "Pakistan":
            case "Sri Lanka":
            case "Brunei":
            case "Vietnam":
            case "Indonesia":
            case "Cambodia":
            case "Laos":
            case "Malaysia":
            case "Myanmar":
            case "Singapore":
            case "East Timor":
            case "Thailand":
            case "Philippines":
            case "China":
            case "Mongolia":
            case "South Korea":
            case "North Korea":
            case "Japan":
            case "Kyrgyzstan":
            case "Tajikistan":
            case "Turkmenistan":
            case "Uzbekistan":
            case "Palestine":
            case "Taiwan":
            {
                System.out.println(country + " is located on the continent of " +Continent.EURASIA);
                break;
            }
            case "Nigeria" :
            case "Ethiopia" :
            case "Egypt" :
            case "DR Congo" :
            case "Tanzania" :
            case "South Africa" :
            case "Kenya" :
            case "Uganda" :
            case "Algeria" :
            case "Sudan" :
            case "Morocco" :
            case "Angola" :
            case "Mozambique" :
            case "Ghana" :
            case "Madagascar" :
            case "Cameroon" :
            case "Côte d'Ivoire" :
            case "Niger" :
            case "Burkina Faso" :
            case "Mali" :
            case "Malawi" :
            case "Zambia" :
            case "Senegal" :
            case "Chad" :
            case "Somalia" :
            case "Zimbabwe" :
            case "Guinea" :
            case "Rwanda" :
            case "Benin" :
            case "Burundi" :
            case "Tunisia" :
            case "South Sudan" :
            case "Togo" :
            case "Sierra Leone" :
            case "Libya" :
            case "Congo" :
            case "Liberia" :
            case "Central African Republic" :
            case "Mauritania" :
            case "Eritrea" :
            case "Namibia" :
            case "Gambia" :
            case "Botswana" :
            case "Gabon" :
            case "Lesotho" :
            case "Guinea-Bissau" :
            case "Equatorial Guinea" :
            case "Mauritius" :
            case "Eswatini" :
            case "Djibouti" :
            case "Comoros" :
            case "Cabo Verde" :
            case "Sao Tome & Principe" :
            case "Seychelles" :
            {
                System.out.println(country + " is located on the continent of " +Continent.AFRICA);
                break;
            }
            case "United States" :
            case "Mexico" :
            case "Canada" :
            case "Guatemala" :
            case "Haiti" :
            case "Dominican Republic" :
            case "Cuba" :
            case "Honduras" :
            case "Nicaragua" :
            case "Anguilla " :
            case "Antigua and Barbuda" :
            case "Aruba " :
            case "Bahamas" :
            case "Barbados" :
            case "Belize" :
            case "Bermuda" :
            case "British Virgin Islands" :
            case "Cayman Islands" :
            case "Costa Rica" :
            case "Dominica" :
            case "El Salvador" :
            case "Greenland " :
            case "Grenada" :
            case "Guadeloupe " :
            case "Jamaica" :
            case "Martinique" :
            case "Montserrat" :
            case "Navassa Island" :
            case "Netherlands Antilles " :
            case "Panama" :
            case "Puerto Rico " :
            case "Saint Kitts and Nevis" :
            case "Saint Lucia" :
            case "Saint-Pierre and Miquelon " :
            case "Saint Vincent and the Grenadines" :
            case "Trinidad and Tobago" :
            case "Turks and Caicos Islands " :
            case "United States Virgin Islands" :
            {
                System.out.println(country + " is located on the continent of " +Continent.NORTH_AMERICA);
                break;
            }
            case "Argentina" :
            case "Bolivia" :
            case "Brazil" :
            case "Chile" :
            case "Colombia" :
            case "Ecuador" :
            case "French Guiana" :
            case "Guyana" :
            case "Paraguay" :
            case "Peru" :
            case "Suriname" :
            case "Uruguay" :
            case "Venezuela" :
            {
                System.out.println(country + " is located on the continent of " +Continent.SOUTH_AMERICA);
                break;
            }
            case "Antarctica" :
            {
                System.out.println(country + " is located on the continent of " +Continent.ANTARCTICA);
                break;
            }
            case "Australia" :
            case "Vanuatu" :
            case "Kiribati" :
            case "Marshall Islands" :
            case "Nauru" :
            case "New Zealand" :
            case "Palau" :
            case "Papua New Guinea" :
            case "Samoa" :
            case "Solomon Islands" :
            case "Tonga" :
            case "Tuvalu" :
            case "Fiji" :
            {
                System.out.println(country + " is located on the continent of " +Continent.OCEANIA);
                break;
            }
            default:
              System.out.println("no such country found.");
        }
    }
}

