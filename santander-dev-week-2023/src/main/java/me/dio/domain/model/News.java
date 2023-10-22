package me.dio.domain.model;

import jakarta.persistence.Entity;

/**
 * Classe extende a BaseItem, pois possui a mesma implementação de código da classe Feature
 *
 * @author caiomariano1
 */
@Entity(name = "tb_news")
public class News extends BaseItem {

}