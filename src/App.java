
public class App {
    public static void main(String[] args) {
        int op = 1;
        int id = 0;
        boolean found;
        do {
            showMenu();
            op = Console.lerInt("Enter an option: ");

            switch(op) {
                case 1: //Cadastrando viagem de carro
                    System.out.println("New car trip");
                    Car c = new Car();
                    c.setId(Console.lerInt("Enter a id for your vehicle: "));
                    if(VehicleList.getVehicle(c.getId()) == null) {
                        c.setName(Console.lerString("Enter the car name: "));
                        c.setBrand(Console.lerString("Enter the car brand: "));
                        c.setPrice(Console.lerFloat("Enter the car price: "));
                        c.setKmFuelTank(Console.lerFloat("Quantity of traveled kilometers of the trip: "));
                        c.setTankSize(Console.lerInt("Tank size: "));
                        c.setPeople(Console.lerInt("Number of people who traveled with you in the car: "));
                        c.calcularConsumo();
                        VehicleList.addVehicle(c);
    
                        System.out.println("Successfully registered car trip!");
                    }else {
                        System.out.println("Id already in use, try another.");
                    }
                   

                    break;
                case 2: //Cadastrando viagem de moto
                    System.out.println("New motorcyle trip");
                    Motorcycle m = new Motorcycle();

                    m.setId(Console.lerInt("Enter a id for your vehicle: "));
                    if(VehicleList.getVehicle(m.getId()) == null) {
                        m.setName(Console.lerString("Enter the motorcycle name: "));
                        m.setBrand(Console.lerString("Enter the motorcycle brand: "));
                        m.setPrice(Console.lerFloat("Enter the motorcycle price: "));
                        m.setKmFuelTank(Console.lerFloat("Quantity of traveled kilometers of the trip: "));
                        m.setTankSize(Console.lerInt("Tank size: "));
                        m.calcularConsumo();
                        VehicleList.addVehicle(m);

                        System.out.println("Successfully registered motorcycle trip!");
                    }else {
                        System.out.println("Id already in use, try another.");
                    }
                    break;
                case 3: //Buscando viagem de veiculo pelo id do veiculo
                    if(VehicleList.getVehicles().size() > 0) {
                        System.out.println("\nSearch vehicle");
                        id = Console.lerInt("Enter the id of your vehicle: ");

                        Vehicle v = VehicleList.getVehicle(id);
                        if(v != null) {
                            System.out.println("\nVehicle found (" +
                            v.getClass().getName() + "):\n" + v.toString());
                        } else {
                            System.out.println("Vehicle not found.");
                        }
                    }else {
                        System.out.println("No vehicles registered yet.");
                    }
                    
                    break;
                case 4: // Listando viagens de carro
                    
                    if(VehicleList.getVehicles().size() > 0) {
                        System.out.println("Cars registered:");
                        found = false;
                        for(Vehicle temp : VehicleList.getVehicles()) {
                            if(temp.getClass().getName().equals("Car")) {
                                System.out.println(temp.toString());
                                found = true;
                            }
                        }

                        if(!found) {
                            System.out.println("No cars registered yet...");
                        }
                    }else {
                        System.out.println("No vehicles registered yet...");
                    }
                    
                    break;
                case 5: //Listando viagens de moto
                    if(VehicleList.getVehicles().size() > 0) {
                        System.out.println("Motorcycles registered:");
                        found = false;
                        for(Vehicle temp : VehicleList.getVehicles()) {
                            if(temp.getClass().getName().equals("Motorcycle")) {
                                System.out.println(temp.toString());
                                found = true;
                            }
                        }

                        if(!found) {
                            System.out.println("No motorcycles registered yet...");
                        }
                    }else {
                        System.out.println("No vehicles registered yet...");
                    }
                    break;
                case 6: //Listando todas os veiculos
                    if(VehicleList.getVehicles().size() > 0) {
                        System.out.println("Vehicles list: ");
                        for(Vehicle temp : VehicleList.getVehicles()) {
                                System.out.println(temp.toString());
                        }
                    }else {
                        System.out.println("There are no registered vehicles yet.");
                    }
                    
                    break;
                case 7: //Removendo um veiculo
                    System.out.println("\nRemoving vehicle...");
                    id = Console.lerInt("Enter the id of the vehicle you want to delete: ");

                    Vehicle v = VehicleList.getVehicle(id);

                    if(v != null) {
                        String confirm;
                        System.out.println("\nVehicle found: " + v.toString());
                        confirm = Console.lerString("Are you sure you want to delete?(Y/N)");
                        if(confirm.equals("Y")) {
                            VehicleList.removeVehicle(v);
                            System.out.println("Vehicle removed with success.");
                        }else {
                            System.out.println("Vehicle not removed.");
                        }
                        
                    }else {
                        System.out.println("Vehicle not found.");
                    }
                    break;
                case 8: //Registrando exposição
                    System.out.println("Registering show room");

                    if(VehicleList.getVehicles().size() > 0) {
                        ShowRoom s = new ShowRoom();
                    s.setId(Console.lerInt("Enter an id for the show room: "));

                    if(ShowRoomList.getShowRoom(s.getId()) == null) {
                        int idv=0;
                        s.setExpoName(Console.lerString("Enter the show room name: "));
                        s.setExpoLocal(Console.lerString("Enter the location of the show room: "));
                        s.setData(Console.lerString("Enter the event date: "));
                        System.out.println("Now, choose the id of the vehicles that will compares:");

                        //Mostrando os veiculos adicionados
                        for(Vehicle temp : VehicleList.getVehicles()) {
                                System.out.println(temp.toString());
                        }
                        System.out.println("To stop choosing, press '-1'");

                        
                        //Criando um array para armazenar as escolhas do usuario
                        //Enquanto o usuario não digitar -1
                        //nós pegamos o veiculo que ele selecionou e armazenamos 
                        //na lista VehiclesShowRoomList

                        while (idv != -1) {
                            idv = Console.lerInt("ID: ");
                            if(idv == -1) {
                                break;
                            }
                            if(VehiclesSR.getVehiclesSR(idv) == null){
                                Vehicle vsr = VehicleList.getVehicle(idv);
                                VehiclesSR.addShowRom(vsr);
                                System.out.println("Vehicle with ID = " + idv + "registred with success!");
                            }else {
                                System.out.println("Vehicle already added");
                            }
                            
                        }
                        
                        s.setExpoVList(VehiclesSR.getVehiclesSRList());
                        ShowRoomList.addShowRom(s);
                    }
                    }else {
                        System.out.println("There are no registered vehicles yet.");
                    }
                    
                    break;

                case 9: // Procurando sala de exposição pelo id
                    if(ShowRoomList.getShowRooms().size() > 0) {
                        System.out.println("\nSearch show room");
                        id = Console.lerInt("Enter the id of your show room: ");

                        ShowRoom s = ShowRoomList.getShowRoom(id);
                        if(s != null) {
                            System.out.println("\nRoom found: " + s.toString());
                        } else {
                            System.out.println("Room not found.");
                        }
                    }else {
                        System.out.println("No show rooms registered yet.");
                    }
                    break;
                case 10: // Listar todas as salas de exposição
                    if(ShowRoomList.getShowRooms().size() > 0) {
                        System.out.println("Show rooms list: ");
                        for(ShowRoom temp : ShowRoomList.getShowRooms()) {
                                System.out.println(temp.toString());
                        }
                    }else {
                        System.out.println("There are no registered show rooms yet.");
                    }
                    break;
                case 11: // Excluir sala de exposição
                    System.out.println("\nRemoving show room...");
                    id = Console.lerInt("Enter the id of the show room that you want to delete: ");

                    ShowRoom s = ShowRoomList.getShowRoom(id);

                    if(s != null) {
                        String confirm;
                        System.out.println("\nShow room found: " + s.toString());
                        confirm = Console.lerString("Are you sure you want to delete?(Y/N)");
                        if(confirm.equals("Y")) {
                            ShowRoomList.removeShowRoom(s);
                            System.out.println("Show room removed with success.");
                        }else {
                            System.out.println("Show room not removed.");
                        }
                        
                    }else {
                        System.out.println("Show not found.");
                    }
                    break;
                case 0: // Finalizando o sistema
                    System.out.println("Terminating the system");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        }while(op != 0);
    }

    private static void showMenu() {
        System.out.println("\n##### VEHICLES #####");
        System.out.println("1) Register car");
        System.out.println("2) Register motorcycle ");
        System.out.println("3) Search by vehicle id");
        System.out.println("4) List all cars");
        System.out.println("5) List all motorcycles");
        System.out.println("6) List all vehicles");
        System.out.println("7) Remove vehicle");
        System.out.println("8) Register show room");
        System.out.println("9) Search show rooms");
        System.out.println("10) List all show rooms");
        System.out.println("11) Delete show rooms");
    }
}
