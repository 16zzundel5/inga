# -*- coding: utf-8 -*-
# Generated by Django 1.9.7 on 2016-07-18 12:10
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('inga', '0012_auto_20160717_1927'),
    ]

    operations = [
        migrations.AlterField(
            model_name='extraction',
            name='date',
            field=models.DateField(blank=True, null=True),
        ),
    ]
