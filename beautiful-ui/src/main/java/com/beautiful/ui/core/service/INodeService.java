package com.beautiful.ui.core.service;

import com.beautiful.ui.core.dao.BaseMongoDao;
import com.beautiful.ui.core.model.Node;

import java.util.List;

public interface INodeService extends BaseMongoDao<Node> {
    /**
     * 通过groupId 查询 节点
     *
     * @param groupId
     * @return
     */
    List<Node> findNodesByGroupId(String groupId);
}
