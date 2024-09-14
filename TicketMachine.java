public class TicketMachine {
    private int ticketPrice;   // Harga tiket
    private int balance;       // Uang yang telah dimasukkan pengguna
    private int total;         // Total uang yang telah dikumpulkan mesin

    // Constructor untuk TicketMachine
    public TicketMachine(int price) {
        this.ticketPrice = price;
        this.balance = 0;
        this.total = 0;
    }

    // Method untuk mendapatkan harga tiket
    public int getTicketPrice() {
        return ticketPrice;
    }

    // Method untuk memasukkan uang ke dalam mesin
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Anda telah memasukkan: " + amount + " units.");
        } else {
            System.out.println("Masukkan jumlah uang yang valid.");
        }
    }

    // Method untuk mencetak tiket jika saldo cukup
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

    // Method untuk mengembalikan saldo yang belum digunakan
    public void refundBalance() {
        System.out.println("Mengembalikan saldo: " + balance + " units.");
        balance = 0;
    }

    // Method untuk mengecek total uang yang telah dikumpulkan mesin
    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        TicketMachine machine = new TicketMachine(50);  // Harga tiket 50 units
        
        // Simulasi penggunaan mesin tiket
        machine.insertMoney(30);  // Masukkan 30 units
        machine.printTicket();    // Coba cetak tiket (saldo tidak cukup)
        
        machine.insertMoney(30);  // Masukkan 30 units lagi
        machine.printTicket();    // Cetak tiket (saldo cukup)
        
        machine.refundBalance();  // Refund saldo
        System.out.println("Total uang di mesin: " + machine.getTotal() + " units.");
    }
}
