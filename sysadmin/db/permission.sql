SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- 用户组表
DROP TABLE IF EXISTS groups;
CREATE TABLE groups
(
    id           VARCHAR(20) PRIMARY KEY COMMENT 'id',
    parent_id    VARCHAR(20)  NOT NULL COMMENT '用户组父id',
    name         VARCHAR(200) COMMENT '用户组名称',
    description  VARCHAR(500) COMMENT '描述',
    deleted      VARCHAR(1)   NOT NULL DEFAULT 'N' COMMENT '是否已删除Y：已删除，N：未删除',
    created_time DATETIME     NOT NULL DEFAULT now() COMMENT '创建时间',
    updated_time DATETIME     NOT NULL DEFAULT now() COMMENT '更新时间',
    created_by   VARCHAR(100) NOT NULL COMMENT '创建人',
    updated_by   VARCHAR(100) NOT NULL COMMENT '更新人'
) COMMENT '用户组表';