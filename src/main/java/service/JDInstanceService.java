package main.java.service;

import main.java.dao.JDInstanceDAO;
import main.java.domain.JDInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by Admin on 30.11.14.
 */
@Service
public class JDInstanceService {

        @Autowired
        private JDInstanceDAO instanceDAO;

        @Transactional
        public void addInstance(JDInstance instance) {

            JDInstanceDAO.saveIntoDB(instance);

        }

        @Transactional
        public List<JDInstance> listInstance(String table) {

            return JDInstanceDAO.listSurveyInstance(table);
        }

        @Transactional
        public void removeInstance(int id, Class<JDInstance> instanceClass) {

            JDInstanceDAO.removeSurveyInstance(id, instanceClass);

        }
    }

