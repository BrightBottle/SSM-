package online.shixun.ssmresume.mapper;

import online.shixun.ssmresume.model.SendEmail;

/**
 * Created by 张罗平 on 2018/1/24.
 */
public interface SendEmailMapper {

    //保存邮件信息 及资料
    int saveSendEmail(SendEmail sendEmail);
}
