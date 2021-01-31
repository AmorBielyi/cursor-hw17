package com.romanbielyi.hw17.services;

import com.romanbielyi.hw17.dao.NotebookRepository;
import com.romanbielyi.hw17.models.Notebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotebookService {
    @Autowired
    private NotebookRepository notebookRepository;

    public Iterable<Notebook> getAll() {
        return notebookRepository.findAll();
    }

    public Iterable<Notebook> getAllDescSortedByManufacturer() {
        return notebookRepository.findNotebookByOrderByManufacturerDesc();
    }

    public Iterable<Notebook> getAllWithGreaterThan(int ramValue) {
        return notebookRepository.findNotebookByRamGreaterThanEqual(ramValue);
    }

    public Iterable<Notebook> getAllRefurbished() {
        return notebookRepository.findNotebookByRefurbishedEquals(true);
    }

    public Notebook add(Notebook notebook) {
        return notebookRepository.save(notebook);
    }
}
