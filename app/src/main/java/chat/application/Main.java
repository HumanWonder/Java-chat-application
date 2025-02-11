package chat.application;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar RemoteAccessTool.jar [server|client]");
            return;
        }

        switch (args[0].toLowerCase()) {
            case "server":
                Server.main(new String[]{});
                break;
            // case "client":
            //     Client.main(new String[]{});
            //     break;
            default:
                System.out.println("Argument inconnu. Utilisez 'server' ou 'client'.");
        }
    }
}
    