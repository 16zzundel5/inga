# -*- coding: utf-8 -*-
# Generated by Django 1.9.7 on 2016-07-17 17:27
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('inga', '0011_auto_20160717_0144'),
    ]

    operations = [
        migrations.AlterField(
            model_name='extraction',
            name='comments',
            field=models.TextField(blank=True, null=True),
        ),
    ]
