package mbat.master.service;

import jakarta.persistence.EntityNotFoundException;
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
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU1(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU2ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU2(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU3ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU3(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU4ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU4(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU5ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU5(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU6ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU6(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU7ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU7(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU8ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU8(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU9ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU9(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU10ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU10(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }


    public void setU11ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU11(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU12ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU12(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }

    public void setU13ToActive(Long statusId) {
        Status status = statusRepository.findById(statusId).orElseThrow(() -> new EntityNotFoundException("Status not found: " + statusId));
        status.setU13(1); // Aktif olarak ayarla
        statusRepository.save(status); // Değişiklikleri kaydet
    }


}
