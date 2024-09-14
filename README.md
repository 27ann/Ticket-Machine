# Ticket-Machine
Tugas PBO Pertemuan 3

public class TicketMachine {
    private int ticketPrice;   
    private int balance;   
    private int total;        

public TicketMachine(int price) {
        this.ticketPrice = price;
        this.balance = 0;
        this.total = 0;
    }

public int getTicketPrice() {
        return ticketPrice;
    }

public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Anda telah memasukkan: " + amount + " units.");
        } else {
            System.out.println("Masukkan jumlah uang yang valid.");
        }
    }

public void printTicket() {
        if (balance >= ticketPrice) {
            System.out.println("Mencetak tiket...");
            System.out.println("Harga tiket: " + ticketPrice + " units.");
            balance -= ticketPrice;
            total += ticketPrice;
            System.out.println("Tiket berhasil dicetak. Sisa saldo: " + balance + " units.");
        } else {
            System.out.println("Saldo tidak cukup. Tambahkan lebih banyak uang.");
        }
    }

public void refundBalance() {
        System.out.println("Mengembalikan saldo: " + balance + " units.");
        balance = 0;
    }

public int getTotal() {
        return total;
    }

public static void main(String[] args) {
        TicketMachine machine = new TicketMachine(50);  
        machine.insertMoney(30); 
        machine.printTicket();   
        machine.insertMoney(30);  
        machine.printTicket();   
        machine.refundBalance();
        System.out.println("Total uang di mesin: " + machine.getTotal() + " units.");
    }
}
