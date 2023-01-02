package homework26.service;

import homework26.dao.StatusDao;
import homework26.entity.Status;

import java.util.List;

public class StatusService {
    private final StatusDao statusDao = new StatusDao();

    public void save(Status status) {
        statusDao.save(status);
    }

    public Status getById(int id) {
        Status status = statusDao.getById(id);
        return status;
    }

    public void updateAgeById(int id, String description) {
        statusDao.updateDescriptionById(id, description);
    }

    public void deleteById(int id) {
        statusDao.deleteById(id);
    }

    public List<Status> getAll() {
        List<Status> statuses = statusDao.getAll();
        return statuses;
    }
}
