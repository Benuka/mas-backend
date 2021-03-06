package com.xelvias.services;

import com.xelvias.dao.EntryDAO;
import com.xelvias.dao.EntryDAOImpl;
import com.xelvias.models.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class EntryServiceImpl implements EntryService {

    @Autowired
    EntryDAO entryDAO;

    public void saveEntry(Entry entry) {
        entryDAO.save(entry);
    }

    public List<Entry> getAll() {
        return entryDAO.findAllEntries();
    }

    public Entry getSample(){
        return new Entry();
    }
}
