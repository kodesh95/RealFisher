package com.example.realfisher.domain.user.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Objects;

@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LessorDTO {

  private long lessorKey;
  private String lessorId;
  private String lessorPw;
  private String lessorName;
  private String lessorEmail;
  private String lessorPhone;
  private boolean lessorIsDeleted;
  private Timestamp lessorRegDate;
  private Timestamp lessorBirth;
  private String lessorAddress;
  private long lessorAccount; //계좌번호
  private long registrationNum; // 건물 등본
  private long lessorCoin;


}