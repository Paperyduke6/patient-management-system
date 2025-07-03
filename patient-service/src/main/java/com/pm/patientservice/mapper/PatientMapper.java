package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDto(Patient patient){
        PatientResponseDTO patientDto = new PatientResponseDTO();
        patientDto.setId(patient.getId().toString());
        patientDto.setName(patient.getName().toString());
        patientDto.setAddress(patient.getAddress().toString());
        patientDto.setDateOfBirth(patient.getDateOfBirth().toString());
        patientDto.setEmail(patient.getEmail().toString());
        return  patientDto;
    }
    public static Patient toModel(PatientRequestDTO patientRequestDto){
        Patient patient = new Patient();
        patient.setName(patientRequestDto.getName());
        patient.setAddress(patientRequestDto.getAddress());
        patient.setEmail(patientRequestDto.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDto.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDto.getRegisteredDate()));
        return patient;
    }
}
