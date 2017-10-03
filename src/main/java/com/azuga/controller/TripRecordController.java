package com.azuga.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.azuga.dao.TripDao;
import com.azuga.model.TripCollectionVO;
@Controller
public class TripRecordController {
	private static final Logger log = 
			   LoggerFactory.getLogger(TripRecordController.class);
	@Autowired
    private TripDao tripDao;
 
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(String id) {
        try {
        	TripCollectionVO person = new TripCollectionVO();
        	person.setId(id);
        	tripDao.delete(person);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "Person succesfully deleted!";
    }
 
    @RequestMapping(value = "/save")
    @ResponseBody
    public String create(String name, String city) {
        try {
        	TripCollectionVO person = new TripCollectionVO();
            person.setVehicle(name.toString());
            person.setAssetno(city.toString());
            tripDao.savePerson(person);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "Person succesfully saved!";
    }
    @RequestMapping(value = "/allPersons")
    @ResponseBody
    public List<TripCollectionVO> getAllPersons() {
        try {
        	//tripDao.getTagIds()
            return tripDao.getAllTripRecords();
        } catch (Exception ex) {
            return null;
        }
    }
}
