package mbat.master.service;

import mbat.master.entity.Content;
import mbat.master.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContentService {

    private final ContentRepository contentRepository;

    @Autowired
    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public List<Content> getAllContents() {
        return contentRepository.findAll();
    }

    public List<Content> getContentByUnitId(Long unitId) {
        return contentRepository.findByUnitId(unitId);
    }
}
