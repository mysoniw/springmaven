package com.store.comp.control.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.core.dao.AbstractIBatisDao;
import com.store.comp.control.dto.Code;
import com.store.comp.control.dto.Group;


@Repository
public class CacheDao extends AbstractIBatisDao {

   
   public Code insertCode(Code code){
      return (Code)template.insert("control.insertCode", code);
   }
   
   @SuppressWarnings("unchecked")
   public List<Group> selectAvailableGroups(){
      return template.queryForList("control.selectAvailableGroups");
   }
   
   @SuppressWarnings("unchecked")
   public List<Code> selectEntireCodes(){
      return template.queryForList("control.selectEntireCodes");
   }

   @SuppressWarnings("unchecked")
   public List<Code> selectAvailableCodes(){
      return template.queryForList("control.selectAvailableCodes");
   }

   @SuppressWarnings("unchecked")
   public List<Code> selectAvailableCodesFromGroup(String gorupId){
      return template.queryForList("control.selectAvailableCodesFromGroup", gorupId);
   }
   
   public int updateCode(Code code){
      return template.update("control.updateCode", code);
   }
   
   public Code selectCode(Code code){
      return (Code)template.queryForObject("control.selectCode", code);
   }

   public int deleteCode(Code code){
      return template.delete("control.deleteCode", code);
   }   

   public int deleteEntireGroup(){
      return template.delete("control.deleteEntireGroup");
   }
   
   public int deleteEntireCodes(){
      return template.delete("control.deleteEntireCodes");
   }   
}
