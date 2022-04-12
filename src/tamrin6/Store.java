package tamrin6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Store {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        properties.load(classLoader.getResourceAsStream("Config.properties"));
        Scanner input = new Scanner(System.in);
        List<Commodity> commodities = new ArrayList<>();
        List<Commodity> selectedCommodities = new ArrayList<>();
        ElectricalAppliances phone = new ElectricalAppliances(1, "Phone", "Apple", "iPhone 13 Pro", 2, 38799000);
        ElectricalAppliances laptop = new ElectricalAppliances(2, "Laptop", "Apple", "MacBook Pro M1", 10, 35950000);
        Shoes officialShoe = new Shoes(3, "Official", "Shima", "Loid 116", 10, 6490000);
        Shoes sportShoe = new Shoes(4, "Sport", "Pama", "Arad", 0, 199000);
        Readable book = new Readable(5, "Book", "Atisa", "Shahnameh stories", 10, 135000);
        Readable journal = new Readable(6, "Journal", "Marvel Super Heroes", "Marvel Year by Year", 10, 1700000);
        commodities.add(phone);
        commodities.add(laptop);
        commodities.add(officialShoe);
        commodities.add(sportShoe);
        commodities.add(book);
        commodities.add(journal);
        System.out.println("Welcome to SMABF store");
        System.out.print("Are you admin ? ");
        String admin = input.nextLine();
        if (Objects.equals(admin.toUpperCase(Locale.ROOT), "YES")) {
            System.out.print("Enter Admin Password : ");
            String Password = input.nextLine();
            File passwordFile = new File(properties.getProperty("address_password_file") + "Admin_Password.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(passwordFile));
            String adminPass = bufferedReader.readLine();
            while (!Objects.equals(Password, adminPass)) {
                System.out.println("Incorrect password. Try again");
                System.out.print("Enter Password : ");
                Password = input.nextLine();
            }
            System.out.println(true);
        } else {
            System.out.println("You need to register to get started");
            User user = new User();
            Cart cart = new Cart(0);
            Address address = new Address();
            System.out.print(Color.ANSI_YELLOW + "First Name : " + Color.ANSI_RESET);
            user.setFirstName(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "Last Name : " + Color.ANSI_RESET);
            user.setLastName(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "Mobile : " + Color.ANSI_RESET);
            user.setMobile(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "Username : " + Color.ANSI_RESET);
            user.setUserName(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "Password : " + Color.ANSI_RESET);
            user.setPassword(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "Email : " + Color.ANSI_RESET);
            user.setEmail(input.nextLine());
            System.out.println("Now Enter your info address");
            System.out.print(Color.ANSI_YELLOW + "State : " + Color.ANSI_RESET);
            address.setState(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "City : " + Color.ANSI_RESET);
            address.setCity(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "Street : " + Color.ANSI_RESET);
            address.setStreet(input.nextLine());
            System.out.print(Color.ANSI_YELLOW + "Postal Code : " + Color.ANSI_RESET);
            address.setPostalCode(input.nextLine());
            System.out.println(Color.ANSI_GREEN + "Your information was successfully registered" + Color.ANSI_RESET);
            user.setAddress(address);
            System.out.println(Color.ANSI_BLUE + "\n====================================================================================================================" + Color.ANSI_RESET);
            System.out.printf(Color.ANSI_CYAN + "%-5s%-25s%-25s%-25s%-25s%-25s%n", "ID", "Model", "Type", "Brand", "Number", "Price" + Color.ANSI_RESET);
            System.out.println(Color.ANSI_BLUE + "--------------------------------------------------------------------------------------------------------------------" + Color.ANSI_RESET);
            for (Commodity commodity : commodities) {
                System.out.printf(Color.ANSI_CYAN + "%-5s%-25s%-25s%-25s%-25d%-25d%n", commodity.getId(), commodity.getModel(), commodity.getType(), commodity.getBrand(), commodity.getNumber(), commodity.getPrice());
            }
            System.out.println(Color.ANSI_BLUE + "====================================================================================================================" + Color.ANSI_RESET);
            int flag = 1;
            while (flag == 1) {
                System.out.print(Color.ANSI_YELLOW + "Select the desired operation (Final approval : 2 , Add : 1 , Delete : 0) : " + Color.ANSI_RESET);
                int operation = input.nextInt();
                if (operation == 1) {
                    System.out.print(Color.ANSI_YELLOW + "Please enter the id of the product you want to add to the cart : " + Color.ANSI_RESET);
                    int id = input.nextInt();
                    for (int i = 0; i < commodities.size(); i++) {
                        if (id == commodities.get(i).getId())
                            if (commodities.get(i).getNumber() != 0) {
                                if (selectedCommodities.size() < 5) {
                                    System.out.println(Color.ANSI_GREEN + "Product added successfully" + Color.ANSI_RESET);
                                    selectedCommodities.add(new Commodity(commodities.get(i).getId(), commodities.get(i).getModel(), commodities.get(i).getType(), commodities.get(i).getBrand(), 1, commodities.get(i).getPrice()));
                                    commodities.get(i).setNumber(commodities.get(i).getNumber() - 1);
                                    break;
                                } else {
                                    System.out.println(Color.ANSI_RED + "You can not add more than 5 items to your cart" + Color.ANSI_RESET);
                                    break;
                                }
                            } else {
                                System.out.println(Color.ANSI_RED + "The product is finished" + Color.ANSI_RESET);
                                break;
                            }
                        if (i == commodities.size() - 1)
                            System.out.println(Color.ANSI_RED + "The product was not found for add" + Color.ANSI_RESET);
                    }
                } else if (operation == 0) {
                    System.out.print(Color.ANSI_YELLOW + "Please enter the id of the product you want to delete to the cart : " + Color.ANSI_RESET);
                    int id = input.nextInt();
                    int i = 0;
                    while (selectedCommodities.size() > 0) {
                        if (id == selectedCommodities.get(i).getId()) {
                            selectedCommodities.remove(i);
                            System.out.println(Color.ANSI_GREEN + "The product was deleted" + Color.ANSI_RESET);
                            commodities.get(i).setNumber(commodities.get(i).getNumber() + 1);
                            break;
                        }
                        else
                            i ++;
                        if (i == selectedCommodities.size()) {
                            System.out.println(Color.ANSI_RED + "The product was not found for delete" + Color.ANSI_RESET);
                            break;
                        }
                    }
                } else if (operation == 2) {
                    if (cart.getCommodities() != null) {
                        System.out.println(Color.ANSI_GREEN + "Your purchase was successful" + Color.ANSI_RESET);
                        while (cart.getCommodities().size() != 0)
                            cart.getCommodities().remove(0);
                    }
                    System.out.println(Color.ANSI_BLUE + "\n====================================================================================================================" + Color.ANSI_RESET);
                    System.out.printf(Color.ANSI_CYAN + "%-5s%-25s%-25s%-25s%-25s%-25s%n", "ID", "Model", "Type", "Brand", "Number", "Price (T)" + Color.ANSI_RESET);
                    System.out.println(Color.ANSI_BLUE + "--------------------------------------------------------------------------------------------------------------------" + Color.ANSI_RESET);
                    for (Commodity commodity : commodities) {
                        System.out.printf(Color.ANSI_CYAN + "%-5s%-25s%-25s%-25s%-25d%-25d%n", commodity.getId(), commodity.getModel(), commodity.getType(), commodity.getBrand(), commodity.getNumber(), commodity.getPrice());
                    }
                    System.out.println(Color.ANSI_BLUE + "====================================================================================================================" + Color.ANSI_RESET);
                } else
                    System.out.println(Color.ANSI_RED + "Error selecting the desired operation, try again" + Color.ANSI_RESET);
                cart.setCommodities(selectedCommodities);
                int total = 0;
                if (cart.getCommodities().size() == 0)
                    System.out.println("Your shopping cart is empty");
                else {
                    for (int i = 0; i < cart.getCommodities().size(); i++) {
                        total += cart.getCommodities().get(i).getPrice();
                    }
                    cart.setTotalPrice(total);
                    System.out.println(Color.ANSI_CYAN + "Your cart" + Color.ANSI_RESET);
                    System.out.println(Color.ANSI_BLUE + "====================================================================================================================" + Color.ANSI_RESET);
                    System.out.printf(Color.ANSI_CYAN + "%-5s%-25s%-25s%-25s%-25s%-25s%n", "ID", "Model", "Type", "Brand", "Number", "Price (T)" + Color.ANSI_RESET);
                    System.out.println(Color.ANSI_BLUE + "--------------------------------------------------------------------------------------------------------------------" + Color.ANSI_RESET);
                    for (int i = 0; i < cart.getCommodities().size(); i++) {
                        System.out.printf(Color.ANSI_CYAN + "%-5s%-25s%-25s%-25s%-25d%-25d%n", cart.getCommodities().get(i).getId(), cart.getCommodities().get(i).getModel(), cart.getCommodities().get(i).getType(), cart.getCommodities().get(i).getBrand(), cart.getCommodities().get(i).getNumber(), cart.getCommodities().get(i).getPrice());
                    }
                    System.out.println(Color.ANSI_BLUE + "====================================================================================================================" + Color.ANSI_RESET);
                    System.out.println(Color.ANSI_PURPLE + "Total Price : " + cart.getTotalPrice() + " T" + Color.ANSI_RESET);
                }
            }
        }
    }
}
