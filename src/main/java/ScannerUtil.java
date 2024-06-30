import java.util.Scanner;

public class ScannerUtil {
    // Uma única instância estática de Scanner é criada.
    private static final Scanner SCANNER = new Scanner(System.in);

    // Um método estático público para retornar a única instância de Scanner.
    public static Scanner getScanner() {
        return SCANNER;

    }
}