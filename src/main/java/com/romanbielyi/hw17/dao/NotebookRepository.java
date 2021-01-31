package com.romanbielyi.hw17.dao;

import com.romanbielyi.hw17.models.Notebook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotebookRepository extends CrudRepository<Notebook, Integer> {
    List<Notebook> findNotebookByOrderByManufacturerDesc();

    List<Notebook> findNotebookByRamGreaterThanEqual(int ram);

    List<Notebook> findNotebookByRefurbishedEquals(boolean refurbished);
}
