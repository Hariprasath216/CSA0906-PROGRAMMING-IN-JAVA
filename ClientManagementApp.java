import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Client {
    private String name;
    private String email;
    private String phoneNumber;
    private String company;
    private String projectType;

    public Client(String name, String email, String phoneNumber, String company, String projectType) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format. Please use a valid email address.");
        }
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number. It should contain exactly 10 digits.");
        }

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.projectType = projectType;
    }

    private boolean isValidEmail(String email) {
        // A simple email validation using a regular expression
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public String getProjectType() {
        return projectType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", company='" + company + '\'' +
                ", projectType='" + projectType + '\'' +
                '}';
    }
}

class ClientManagementSystem {
    private List<Client> clients;

    public ClientManagementSystem()
 {
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        if (!isDuplicate(client)) {
            clients.add(client);
            System.out.println("Client added successfully!");
        } else {
            System.out.println("Client with the same email or phone number already exists. Duplicate not added.");
        }
    }

    private boolean isDuplicate(Client newClient) {
        for (Client existingClient : clients) {
            if (existingClient.getEmail().equals(newClient.getEmail()) || 
                existingClient.getPhoneNumber().equals(newClient.getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }

    public void displayClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    public void updateClient(String oldEmail, Client newClient) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getEmail().equals(oldEmail)) {
                clients.set(i, newClient);
                System.out.println("Client updated successfully!");
                return;
            }
        }
        System.out.println("Client not found!");
    }

    public void deleteClient(String email) {
        clients.removeIf(client -> client.getEmail().equals(email));
        System.out.println("Client deleted successfully!");
    }
}

public class ClientManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientManagementSystem cms = new ClientManagementSystem();

        while (true) {
            System.out.println("\n1. Add Client");
            System.out.println("2. Display Clients");
            System.out.println("3. Update Client");
            System.out.println("4. Delete Client");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter client name: ");
                    String name = scanner.nextLine();
                    if (!name.matches("[a-zA-Z]+")) {
                        System.out.println("Invalid client name. It should only contain letters. Client not added.");
                        break;
                    }
                    System.out.print("Enter client email: ");
                    String email = scanner.nextLine();
                    if (!isValidEmailFormat(email)) {
                        System.out.println("Invalid email format. Please use a valid email address. Client not added.");
                        break;
                    }
                    System.out.print("Enter client phone number: ");
                    String phoneNumber = scanner.nextLine();
                    if (!isValidPhoneNumberFormat(phoneNumber)) {
                        System.out.println("Invalid phone number format. It should contain exactly 10 digits. Client not added.");
                        break;
                    }
                    System.out.print("Enter client company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter client project type: ");
                    String projectType = scanner.nextLine();

                    Client newClient = new Client(name, email, phoneNumber, company, projectType);
                    cms.addClient(newClient);
                    break;
                case 2:
                    cms.displayClients();
                    break;
                case 3:
                    System.out.print("Enter client email to update: ");
                    String oldEmail = scanner.nextLine();
                    System.out.print("Enter new client name: ");
                    String newName = scanner.nextLine();
                    if (!newName.matches("[a-zA-Z]+")) {
                        System.out.println("Invalid client name. It should only contain letters. Client not updated.");
                        break;
                    }
                    System.out.print("Enter new client email: ");
                    String newEmail = scanner.nextLine();
                    if (!isValidEmailFormat(newEmail)) {
                        System.out.println("Invalid email format. Please use a valid email address. Client not updated.");
                        break;
                    }
                    System.out.print("Enter new client phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    if (!isValidPhoneNumberFormat(newPhoneNumber)) {
                        System.out.println("Invalid phone number format. It should contain exactly 10 digits. Client not updated.");
                        break;
                    }
                    System.out.print("Enter new client company: ");
                    String newCompany = scanner.nextLine();
                    System.out.print("Enter new client project type: ");
                    String newProjectType = scanner.nextLine();

                    Client updatedClient = new Client(newName, newEmail, newPhoneNumber, newCompany, newProjectType);
                    cms.updateClient(oldEmail, updatedClient);
                    break;
                case 4:
                    System.out.print("Enter client email to delete: ");
                    String deleteEmail = scanner.nextLine();
                    cms.deleteClient(deleteEmail);
                    break;
                case 5:
                    System.out.println("Exiting the client management system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static boolean isValidEmailFormat(String email) {
        // A simple email validation using a regular expression
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    private static boolean isValidPhoneNumberFormat(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }
}
