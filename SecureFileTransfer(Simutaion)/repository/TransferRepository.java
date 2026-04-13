package repository;

import model.Transfer;
import model.TransferLog;
import java.util.ArrayList;

public class TransferRepository {
    private ArrayList<Transfer> transfers = new ArrayList<>();
    private ArrayList<TransferLog> logs = new ArrayList<>();

    public void saveTransfer(Transfer transfer) {
        transfers.add(transfer);
    }
    
    public void saveLog(TransferLog log) {
        logs.add(log);
    }

    public ArrayList<TransferLog> getAllLogs() {
        return logs;
    }

    public Transfer findByTransferId(String transferId) {
        for (Transfer t : transfers) {
            if (t.getTransferId().equals(transferId)) {
                return t;
            }
        }
        return null;
    }
}
