import javax.swing.*;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // Uyarı mesajı göstermek
        JOptionPane.showMessageDialog(null, "Bu bir uyarı mesajıdır!", "Uyarı", JOptionPane.WARNING_MESSAGE);

        // Bilgilendirme mesajı göstermek
        JOptionPane.showMessageDialog(null, "Bu bir bilgilendirme mesajıdır!", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

        // Hata mesajı göstermek
        JOptionPane.showMessageDialog(null, "Bir hata oluştu!", "Hata", JOptionPane.ERROR_MESSAGE);
    }
}
