package mbat.master.service;

import mbat.master.entity.Status;
import mbat.master.repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    private final StatusRepository statusRepository;




    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }




    // Kullanıcı ID'sine göre statüleri döndüren metod
    public List<Status> getStatusesByUserId(Long userId) {
        return statusRepository.findByUserId(userId);
    }


    // u1 değerini 1 olarak ayarlayın
    public void setU1ToActive(Long statusId) {
        updateStatusValue(statusId, "u1");
    }

    // u2 değerini 1 olarak ayarlayın
    public void setU2ToActive(Long statusId) {
        updateStatusValue(statusId, "u2");
    }

    // u3 değerini 1 olarak ayarlayın
    public void setU3ToActive(Long statusId) {
        updateStatusValue(statusId, "u3");
    }


    public void setU4ToActive(Long statusId) {
        updateStatusValue(statusId, "u4");
    }

    // u2 değerini 1 olarak ayarlayın
    public void setU5ToActive(Long statusId) {
        updateStatusValue(statusId, "u5");
    }

    // u3 değerini 1 olarak ayarlayın
    public void setU6ToActive(Long statusId) {
        updateStatusValue(statusId, "u6");
    }


    public void setU7ToActive(Long statusId) {
        updateStatusValue(statusId, "u7");
    }

    // u2 değerini 1 olarak ayarlayın
    public void setU8ToActive(Long statusId) {
        updateStatusValue(statusId, "u8");
    }

    // u3 değerini 1 olarak ayarlayın
    public void setU9ToActive(Long statusId) {
        updateStatusValue(statusId, "u9");
    }

    public void setU10ToActive(Long statusId) {
        updateStatusValue(statusId, "u10");
    }

    // u2 değerini 1 olarak ayarlayın
    public void setU11ToActive(Long statusId) {
        updateStatusValue(statusId, "u11");
    }

    // u3 değerini 1 olarak ayarlayın
    public void setU12ToActive(Long statusId) {
        updateStatusValue(statusId, "u12");
    }


    // u3 değerini 1 olarak ayarlayın
    public void setU13ToActive(Long statusId) {
        updateStatusValue(statusId, "u13");
    }

    private void updateStatusValue(Long statusId, String fieldName) {
        Status status = statusRepository.findById(statusId)
                .orElseThrow(() -> new IllegalArgumentException("Status not found with id: " + statusId));

        switch (fieldName) {
            case "u1":
                status.setU1(1);
                break;
            case "u2":
                status.setU2(1);
                break;
            case "u3":
                status.setU3(1);
                break;
            case "u4":
                status.setU1(1);
                break;
            case "u5":
                status.setU2(1);
                break;
            case "u6":
                status.setU3(1);
                break;
            case "u7":
                status.setU1(1);
                break;
            case "u8":
                status.setU2(1);
                break;
            case "u9":
                status.setU3(1);
                break;
            case "u10":
                status.setU1(1);
                break;
            case "u11":
                status.setU2(1);
                break;
            case "u12":
                status.setU3(1);
                break;
            case "u13":
                status.setU1(1);
                break;
        }

    }

}
